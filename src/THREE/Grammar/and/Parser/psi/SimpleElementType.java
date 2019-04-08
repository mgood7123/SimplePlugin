package THREE.Grammar.and.Parser.psi;

import com.intellij.psi.tree.IElementType;
import TWO.Language.and.File.Type.SimpleLanguage;
import org.jetbrains.annotations.*;

public class SimpleElementType extends IElementType {
    public SimpleElementType(@NotNull @NonNls String debugName) {
        super(debugName, SimpleLanguage.INSTANCE);
    }
}