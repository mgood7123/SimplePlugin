package TEN.Reference.Contributor;


import THREE.Grammar.and.Parser.psi.SimpleProperty;
import com.intellij.lang.refactoring.RefactoringSupportProvider;
import com.intellij.psi.PsiElement;

public class SimpleRefactoringSupportProvider extends RefactoringSupportProvider {
    @Override
    public boolean isMemberInplaceRenameAvailable(PsiElement element, PsiElement context) {
        return element instanceof SimpleProperty;
    }
}