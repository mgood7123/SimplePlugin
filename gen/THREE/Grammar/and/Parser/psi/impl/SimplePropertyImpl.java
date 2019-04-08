// This is a generated file. Not intended for manual editing.
package THREE.Grammar.and.Parser.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static THREE.Grammar.and.Parser.psi.SimpleTypes.*;
import TEN.Reference.Contributor.psi.SimpleNamedElementImpl;
import THREE.Grammar.and.Parser.psi.*;
import SIX.PSI.Helpers.and.Utilities.psi.impl.SimplePsiImplUtil;
import com.intellij.navigation.ItemPresentation;

public class SimplePropertyImpl extends SimpleNamedElementImpl implements SimpleProperty {

  public SimplePropertyImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SimpleVisitor visitor) {
    visitor.visitProperty(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SimpleVisitor) accept((SimpleVisitor)visitor);
    else super.accept(visitor);
  }

  public String getKey() {
    return SimplePsiImplUtil.getKey(this);
  }

  public String getValue() {
    return SimplePsiImplUtil.getValue(this);
  }

  public String getName() {
    return SimplePsiImplUtil.getName(this);
  }

  public PsiElement setName(String newName) {
    return SimplePsiImplUtil.setName(this, newName);
  }

  public PsiElement getNameIdentifier() {
    return SimplePsiImplUtil.getNameIdentifier(this);
  }

  public ItemPresentation getPresentation() {
    return SimplePsiImplUtil.getPresentation(this);
  }

}
