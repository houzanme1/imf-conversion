/**
 * Copyright (C) 2016 Netflix, Inc.
 *
 *     This file is part of IMF Conversion Utility.
 *
 *     IMF Conversion Utility is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     IMF Conversion Utility is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with IMF Conversion Utility.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.netflix.cc.cli;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;


/**
 * Helper to parse command line parameters.
 * <p>
 * Created by Alexandr on 6/2/2016.
 */
public class CmdLineParametersParser {

    private Option help;
    private Option ttmlFile;
    private Option outputScc;
    private Option outputTtml;
    private final Options options = new Options();

    public CmdLineParametersParser() {
        initOptions();
    }

    private void initOptions() {
        help = Option.builder()
                .longOpt("help")
                .desc("Print this message")
                .build();

        ttmlFile = Option.builder()
                .longOpt("ttml")
                .desc("Input TTML file parameters:"
                        + "\n<file> - The TTML file path."
                        + "\n<offsetMS> - Offset in milliseconds to shift captions of the TTML file."
                        + "\n<startMS> - Start time in milliseconds to get captions of the TTML file."
                        + "\n<endMS> - End time in milliseconds to get captions of the TTML file.")
                .numberOfArgs(4)
                .optionalArg(true)
                .argName("<file> <offsetTC> <startTC> <endTC>")
                .build();

        outputScc = Option.builder()
                .longOpt("outputScc")
                .desc("Output SCC file")
                .hasArg()
                .argName("outputScc")
                .build();

        outputTtml = Option.builder()
                .longOpt("outputTTML")
                .desc("Output TTML file")
                .hasArg()
                .argName("outputTtml")
                .build();

        options.addOption(help);
        options.addOption(ttmlFile);
        options.addOption(outputScc);
        options.addOption(outputTtml);
    }

    /**
     * Parses cmd line arguments.
     *
     * @param args arguments from a command line
     * @return a command line parameter object or null if help was invoked.
     */
    public CmdLineParameters parseCmdOptions(String[] args) throws ParseException {
        // create the parser
        CommandLineParser parser = new DefaultParser();
        CommandLine line = parser.parse(options, args);

        // --help
        if (line.hasOption(help.getLongOpt())) {
            // automatically generate the help statement
            HelpFormatter formatter = new HelpFormatter();
            formatter.setWidth(120);
            formatter.printHelp("ttml-to-stl", options);
            return null;
        }

        CmdLineParameters result = new CmdLineParameters();
        // --ttml parameters
        for (Option option : line.getOptions()) {
            if (option.equals(ttmlFile)) {
                TtmlInDescriptor ttmlInDescriptor = new TtmlInDescriptor();
                try {
                    ttmlInDescriptor.setFile(option.getValue(0));
                    ttmlInDescriptor.setOffsetMS(parseTtmlParameter(option, 1, "offsetMS"));
                    ttmlInDescriptor.setStartMS(parseTtmlParameter(option, 2, "startMS"));
                    ttmlInDescriptor.setEndMS(parseTtmlParameter(option, 3, "endMS"));
                } catch (IndexOutOfBoundsException e) {
                    //It is error only if don't have file name
                    //For required file it may not be thrown. We will check it later.
                }

                if (ttmlInDescriptor.getFile() == null) {
                    throw new ParseException("--ttml parameter must have at least <file> attribute defined.");
                }

                result.getTtmlInDescriptors().add(ttmlInDescriptor);
            }
        }
        if (result.getTtmlInDescriptors().isEmpty()) {
            throw new ParseException("At least one input TTML file must be provided");
        }

        // TTML mode parameters
        boolean doOutputTTML = line.hasOption(outputTtml.getLongOpt());
        if (doOutputTTML) {
            result.setDoOuputTtml(true);
            result.setOutputTtmlFile(line.getOptionValue(outputTtml.getLongOpt()));
        }

        // SCC mode parameters
        boolean doOutputScc = line.hasOption(outputScc.getLongOpt());
        if (doOutputScc) {
            result.setDoOutputScc(true);
            result.setOutputSccFile(line.getOptionValue(outputScc.getLongOpt()));
        }

        return result;
    }

    private int parseTtmlParameter(Option option, int optionIndex, String parameterName) throws ParseException {
        try {
            return Integer.parseInt(option.getValue(optionIndex));
        } catch (NumberFormatException e) {
            throw new ParseException(parameterName + " in --ttml must be an integer");
        }
    }
}
