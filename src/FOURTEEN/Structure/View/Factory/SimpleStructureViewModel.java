package FOURTEEN.Structure.View.Factory;

import FOUR.Lexer.and.Parser.Definition.psi.SimpleFile;
import com.intellij.ide.structureView.*;
import com.intellij.ide.util.treeView.smartTree.Sorter;
import com.intellij.psi.PsiFile;
import org.jetbrains.annotations.NotNull;

public class SimpleStructureViewModel extends StructureViewModelBase implements
        StructureViewModel.ElementInfoProvider {
    public SimpleStructureViewModel(PsiFile psiFile) {
        super(psiFile, new SimpleStructureViewElement(psiFile));
    }

    @NotNull
    public Sorter[] getSorters() {
        return new Sorter[]{Sorter.ALPHA_SORTER};
    }


    @Override
    public boolean isAlwaysShowsPlus(StructureViewTreeElement element) {
        return false;
    }

    @Override
    public boolean isAlwaysLeaf(StructureViewTreeElement element) {
        return element instanceof SimpleFile;
    }
}
