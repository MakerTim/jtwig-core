package org.jtwig.value.relational.greater;

import com.google.common.base.Optional;
import org.jtwig.value.JtwigValue;
import org.jtwig.value.relational.RelationalComparator;

public class ComparableGreaterComparator implements RelationalComparator {
    @Override
    public Optional<Boolean> apply(JtwigValue left, JtwigValue right) {
        if (left.asObject() instanceof Comparable && right.asObject() instanceof Comparable) {
            Comparable comparable = (Comparable) left.asObject();
            return Optional.of(comparable.compareTo(right.asObject()) > 0);
        }
        return Optional.absent();
    }
}