package org.jtwig.functions.resolver;

import org.jtwig.functions.SimpleFunction;
import org.jtwig.functions.impl.*;
import org.jtwig.functions.reference.FunctionReference;
import org.jtwig.reflection.resolver.argument.ArgumentResolver;
import org.jtwig.util.ClasspathFinder;

import java.util.Collections;

import static java.util.Arrays.asList;

public class DefaultFunctionResolverConfiguration extends FunctionResolverConfiguration {
    public DefaultFunctionResolverConfiguration() {
        super(asList(
                        new EscapeRawFunction(),
                        new BooleanFunctions(),
                        new ConstantFunction(new ClasspathFinder(DefaultFunctionResolverConfiguration.class.getClassLoader())),
                        new StringFunctions(),
                        new ObjectFunctions(),
                        new MathFunctions(),
                        new NumberFunctions(),
                        new ParentFunction(),
                        new BlockFunction()
                ),
                Collections.<FunctionReference>emptyList(),
                Collections.<SimpleFunction>emptyList(),
                Collections.<ArgumentResolver>emptyList()
        );
    }
}