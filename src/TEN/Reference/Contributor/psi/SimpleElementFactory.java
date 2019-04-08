package TEN.Reference.Contributor.psi;

import FOUR.Lexer.and.Parser.Definition.psi.SimpleFile;
import THREE.Grammar.and.Parser.psi.SimpleProperty;
import TWO.Language.and.File.Type.SimpleFileType;
import com.intellij.openapi.project.Project;
import com.intellij.psi.*;

public class SimpleElementFactory {
    public static SimpleProperty createProperty(Project project, String name) {
        final SimpleFile file = createFile(project, name);
        return (SimpleProperty) file.getFirstChild();
    }

    public static SimpleFile createFile(Project project, String text) {
        String name = "dummy.simple";
        return (SimpleFile) PsiFileFactory.getInstance(project).
                createFileFromText(name, SimpleFileType.INSTANCE, text);
    }

    // EIGHTEEN.Quick.Fix

    public static SimpleProperty createProperty(Project project, String name, String value) {
        final SimpleFile file = createFile(project, name + " = " + value);
        return (SimpleProperty) file.getFirstChild();
    }

    public static PsiElement createCRLF(Project project) {
        final SimpleFile file = createFile(project, "\n");
        return file.getFirstChild();
    }
}