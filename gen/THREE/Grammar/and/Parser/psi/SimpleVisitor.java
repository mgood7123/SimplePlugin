// This is a generated file. Not intended for manual editing.
package THREE.Grammar.and.Parser.psi;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.PsiElement;
import TEN.Reference.Contributor.psi.SimpleNamedElement;

public class SimpleVisitor extends PsiElementVisitor {

  public void visitProperty(@NotNull SimpleProperty o) {
    visitNamedElement(o);
  }

  public void visitNamedElement(@NotNull SimpleNamedElement o) {
    visitPsiElement(o);
  }

  public void visitPsiElement(@NotNull PsiElement o) {
    visitElement(o);
  }

}
