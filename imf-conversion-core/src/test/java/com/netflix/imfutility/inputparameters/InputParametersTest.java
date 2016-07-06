package com.netflix.imfutility.inputparameters;

import com.lexicalscope.jewel.cli.ArgumentValidationException;
import com.lexicalscope.jewel.cli.CliFactory;
import com.netflix.imfutility.ImfUtilityTest;
import com.netflix.imfutility.util.ConfigUtils;
import com.netflix.imfutility.util.ImpUtils;
import com.netflix.imfutility.util.TemplateParameterContextCreator;
import org.apache.commons.io.FileUtils;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNull;

/**
 * Tests that input parameters common for all formats are parsed and validated correctly.
 */
public class InputParametersTest extends ImfUtilityTest {

    @BeforeClass
    public static void setupAll() throws IOException {
        // create both working directory and logs folder.
        FileUtils.deleteDirectory(TemplateParameterContextCreator.getWorkingDir());
        File workingDir = TemplateParameterContextCreator.getWorkingDir();
        if (!workingDir.mkdir()) {
            throw new RuntimeException("Could not create a working dir within tmp folder");
        }
        new File(workingDir, "config.xml");
    }

    @AfterClass
    public static void teardownAll() throws IOException {
        FileUtils.deleteDirectory(TemplateParameterContextCreator.getWorkingDir());
    }

    @Test
    public void testConfigXml() {
        String[] argsConfig = new String[]{
                "-c", ConfigUtils.getCorrectConfigXmlPath()
        };
        String[] argsNoConfig = new String[]{};

        ImfUtilityInputParameters inputParametersConfig = new ImfUtilityInputParameters(
                CliFactory.parseArguments(ImfUtilityCmdLineArgs.class, argsConfig),
                new FakeDefaultTools());
        ImfUtilityInputParameters inputParametersNoConfig = new ImfUtilityInputParameters(
                CliFactory.parseArguments(ImfUtilityCmdLineArgs.class, argsNoConfig),
                new FakeDefaultTools());

        assertEquals(new File(ConfigUtils.getCorrectConfigXmlPath()), inputParametersConfig.getConfigFile());
        assertNull(inputParametersNoConfig.getConfigFile());
    }

    @Test
    public void testCmdLineWorkingDir() {
        String[] argsWorkingDir = new String[]{
                "-w", TemplateParameterContextCreator.getWorkingDir().getAbsolutePath()
        };
        String[] argsNoWorkingDir = new String[]{
        };

        ImfUtilityInputParameters inputParametersWorkingDir = new ImfUtilityInputParameters(
                CliFactory.parseArguments(ImfUtilityCmdLineArgs.class, argsWorkingDir),
                new FakeDefaultTools());
        ImfUtilityInputParameters inputParametersNoWorkingDir = new ImfUtilityInputParameters(
                CliFactory.parseArguments(ImfUtilityCmdLineArgs.class, argsNoWorkingDir),
                new FakeDefaultTools());

        assertEquals(TemplateParameterContextCreator.getWorkingDir(), inputParametersWorkingDir.getWorkingDirFile());
        assertNull(inputParametersNoWorkingDir.getWorkingDirFile());
    }

    @Test
    public void testDefaultWorkingDir() {
        String[] args = new String[]{};
        ImfUtilityInputParameters inputParameters = new ImfUtilityInputParameters(
                CliFactory.parseArguments(ImfUtilityCmdLineArgs.class, args),
                new FakeDefaultTools());

        inputParameters.setDefaultWorkingDir("defaultWorkingDir");

        assertEquals(new File("defaultWorkingDir"), inputParameters.getWorkingDirFile());
    }

    @Test
    public void tesCmdLineWorkingDirReplacesDefault() {
        String[] args = new String[]{
                "-w", TemplateParameterContextCreator.getWorkingDir().getAbsolutePath()
        };
        ImfUtilityInputParameters inputParameters = new ImfUtilityInputParameters(
                CliFactory.parseArguments(ImfUtilityCmdLineArgs.class, args),
                new FakeDefaultTools());

        inputParameters.setDefaultWorkingDir("defaultWorkingDir");

        assertEquals(TemplateParameterContextCreator.getWorkingDir(), inputParameters.getWorkingDirFile());
    }

    @Test
    public void testImpFolder() {
        String[] argsImp = new String[]{
                "--imp", ImpUtils.getImpFolder().getAbsolutePath()
        };
        String[] argsNoImp = new String[]{};

        ImfUtilityInputParameters inputParametersImp = new ImfUtilityInputParameters(
                CliFactory.parseArguments(ImfUtilityCmdLineArgs.class, argsImp),
                new FakeDefaultTools());
        ImfUtilityInputParameters inputParametersNoImp = new ImfUtilityInputParameters(
                CliFactory.parseArguments(ImfUtilityCmdLineArgs.class, argsNoImp),
                new FakeDefaultTools());

        assertEquals(ImpUtils.getImpFolder(), inputParametersImp.getImpDirectoryFile());
        assertNull(inputParametersNoImp.getImpDirectoryFile());
    }

    @Test
    public void testDefaultImpFolder() {
        String[] args = new String[]{};
        ImfUtilityInputParameters inputParameters = new ImfUtilityInputParameters(
                CliFactory.parseArguments(ImfUtilityCmdLineArgs.class, args),
                new FakeDefaultTools());

        inputParameters.setDefaultImp("defaultImp");

        assertEquals(new File("defaultImp"), inputParameters.getImpDirectoryFile());
    }

    @Test
    public void testCmdLineImpReplacesDefault() {
        String[] args = new String[]{
                "--imp", ImpUtils.getImpFolder().getAbsolutePath()
        };
        ImfUtilityInputParameters inputParameters = new ImfUtilityInputParameters(
                CliFactory.parseArguments(ImfUtilityCmdLineArgs.class, args),
                new FakeDefaultTools());

        inputParameters.setDefaultImp("defaultImp");

        assertEquals(ImpUtils.getImpFolder(), inputParameters.getImpDirectoryFile());
    }

    @Test
    public void testCpl() {
        String[] argsCplImp = new String[]{
                "--cpl", ImpUtils.getCorrectCpl().getName(),
                "--imp", ImpUtils.getImpFolder().getAbsolutePath()
        };
        String[] argsCplNoImp = new String[]{
                "--cpl", ImpUtils.getCorrectCpl().getName()
        };
        String[] argsNoCplNoImp = new String[]{
        };


        ImfUtilityInputParameters inputParametersCplImp = new ImfUtilityInputParameters(
                CliFactory.parseArguments(ImfUtilityCmdLineArgs.class, argsCplImp),
                new FakeDefaultTools());
        ImfUtilityInputParameters inputParametersCplNoImp = new ImfUtilityInputParameters(
                CliFactory.parseArguments(ImfUtilityCmdLineArgs.class, argsCplNoImp),
                new FakeDefaultTools());
        ImfUtilityInputParameters inputParametersNoCplNoImp = new ImfUtilityInputParameters(
                CliFactory.parseArguments(ImfUtilityCmdLineArgs.class, argsNoCplNoImp),
                new FakeDefaultTools());

        assertEquals(ImpUtils.getCorrectCpl(), inputParametersCplImp.getCplFile());
        assertNull(inputParametersCplNoImp.getCplFile());
        assertNull(inputParametersNoCplNoImp.getCplFile());
    }

    @Test
    public void testDefaultCpl() {
        String[] args = new String[]{};
        ImfUtilityInputParameters inputParameters = new ImfUtilityInputParameters(
                CliFactory.parseArguments(ImfUtilityCmdLineArgs.class, args),
                new FakeDefaultTools());

        inputParameters.setDefaultImp("defaultImp");
        inputParameters.setDefaultCpl("defaultCpl");

        assertEquals(new File("defaultImp", "defaultCpl"), inputParameters.getCplFile());
    }

    @Test
    public void testCmdLineCplReplacesDefault() {
        String[] args = new String[]{
                "--cpl", ImpUtils.getCorrectCpl().getName(),
                "--imp", ImpUtils.getImpFolder().getAbsolutePath()
        };
        ImfUtilityInputParameters inputParameters = new ImfUtilityInputParameters(
                CliFactory.parseArguments(ImfUtilityCmdLineArgs.class, args),
                new FakeDefaultTools());

        inputParameters.setDefaultCpl("defaultCpl");

        assertEquals(ImpUtils.getCorrectCpl(), inputParameters.getCplFile());
    }

    @Test
    public void testValidateConfigCorrect() {
        String[] args = new String[]{
                "-c", getClass().getClassLoader().getResource(ConfigUtils.getCorrectConfigXmlPath()).getPath()
        };
        ImfUtilityInputParameters inputParameters = new ImfUtilityInputParameters(
                CliFactory.parseArguments(ImfUtilityCmdLineArgs.class, args),
                new FakeDefaultTools());

        ImfUtilityInputParametersValidator.validateCmdLineArguments(inputParameters);
    }

    @Test(expected = ArgumentValidationException.class)
    public void testValidateConfigNotSpecified() {
        String[] args = new String[]{};
        ImfUtilityInputParameters inputParameters = new ImfUtilityInputParameters(
                CliFactory.parseArguments(ImfUtilityCmdLineArgs.class, args),
                new FakeDefaultTools());

        ImfUtilityInputParametersValidator.validateCmdLineArguments(inputParameters);
    }

    @Test(expected = ArgumentValidationException.class)
    public void testValidateConfigNotExistentFile() {
        String[] args = new String[]{
                "-c", "someFile"
        };
        ImfUtilityInputParameters inputParameters = new ImfUtilityInputParameters(
                CliFactory.parseArguments(ImfUtilityCmdLineArgs.class, args),
                new FakeDefaultTools());

        ImfUtilityInputParametersValidator.validateCmdLineArguments(inputParameters);
    }

    @Test
    public void testValidateInputParamsCorrect() {
        String[] args = new String[]{
                "--imp", ImpUtils.getImpFolder().getAbsolutePath(),
                "--cpl", ImpUtils.getCorrectCpl().getName(),
                "-w", TemplateParameterContextCreator.getWorkingDir().getAbsolutePath()
        };
        ImfUtilityInputParameters inputParameters = new ImfUtilityInputParameters(
                CliFactory.parseArguments(ImfUtilityCmdLineArgs.class, args),
                new FakeDefaultTools());

        ImfUtilityInputParametersValidator.validateInputParameters(inputParameters);
    }

    @Test(expected = ArgumentValidationException.class)
    public void testValidateImpNotSpecified() {
        String[] args = new String[]{
                "--cpl", ImpUtils.getCorrectCpl().getName(),
                "-w", TemplateParameterContextCreator.getWorkingDir().getAbsolutePath()
        };
        ImfUtilityInputParameters inputParameters = new ImfUtilityInputParameters(
                CliFactory.parseArguments(ImfUtilityCmdLineArgs.class, args),
                new FakeDefaultTools());

        ImfUtilityInputParametersValidator.validateInputParameters(inputParameters);
    }

    @Test(expected = ArgumentValidationException.class)
    public void testValidateImpNotExistentFolder() {
        String[] args = new String[]{
                "--imp", "someFolder",
                "--cpl", ImpUtils.getCorrectCpl().getName(),
                "-w", TemplateParameterContextCreator.getWorkingDir().getAbsolutePath()
        };
        ImfUtilityInputParameters inputParameters = new ImfUtilityInputParameters(
                CliFactory.parseArguments(ImfUtilityCmdLineArgs.class, args),
                new FakeDefaultTools());

        ImfUtilityInputParametersValidator.validateInputParameters(inputParameters);
    }

    @Test(expected = ArgumentValidationException.class)
    public void testValidateCplNotSpecified() {
        String[] args = new String[]{
                "--imp", ImpUtils.getImpFolder().getAbsolutePath(),
                "-w", TemplateParameterContextCreator.getWorkingDir().getAbsolutePath()
        };
        ImfUtilityInputParameters inputParameters = new ImfUtilityInputParameters(
                CliFactory.parseArguments(ImfUtilityCmdLineArgs.class, args),
                new FakeDefaultTools());

        ImfUtilityInputParametersValidator.validateInputParameters(inputParameters);
    }

    @Test(expected = ArgumentValidationException.class)
    public void testValidateCplNotExistentFile() {
        String[] args = new String[]{
                "--imp", ImpUtils.getImpFolder().getAbsolutePath(),
                "--cpl", "someFile",
                "-w", TemplateParameterContextCreator.getWorkingDir().getAbsolutePath()
        };
        ImfUtilityInputParameters inputParameters = new ImfUtilityInputParameters(
                CliFactory.parseArguments(ImfUtilityCmdLineArgs.class, args),
                new FakeDefaultTools());

        ImfUtilityInputParametersValidator.validateInputParameters(inputParameters);
    }

    @Test(expected = ArgumentValidationException.class)
    public void testValidateWorkingDirNotSpecified() {
        String[] args = new String[]{
                "--imp", ImpUtils.getImpFolder().getAbsolutePath(),
                "--cpl", ImpUtils.getCorrectCpl().getName()
        };
        ImfUtilityInputParameters inputParameters = new ImfUtilityInputParameters(
                CliFactory.parseArguments(ImfUtilityCmdLineArgs.class, args),
                new FakeDefaultTools());

        ImfUtilityInputParametersValidator.validateInputParameters(inputParameters);
    }

    @Test(expected = ArgumentValidationException.class)
    public void testValidateWorkingDirNotExistentFolder() {
        String[] args = new String[]{
                "--imp", ImpUtils.getImpFolder().getAbsolutePath(),
                "--cpl", ImpUtils.getCorrectCpl().getName(),
                "-w", "someFolder"
        };
        ImfUtilityInputParameters inputParameters = new ImfUtilityInputParameters(
                CliFactory.parseArguments(ImfUtilityCmdLineArgs.class, args),
                new FakeDefaultTools());

        ImfUtilityInputParametersValidator.validateInputParameters(inputParameters);
    }

}