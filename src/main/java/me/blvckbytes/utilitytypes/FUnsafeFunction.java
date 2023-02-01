package me.blvckbytes.utilitytypes;

@FunctionalInterface
public interface FUnsafeFunction<I, O, E extends Throwable> {

  O apply(I input) throws E;

}
