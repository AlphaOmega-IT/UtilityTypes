package me.blvckbytes.utilitytypes;

@FunctionalInterface
public interface FUnsafeConsumer<I, E extends Throwable> {

  void accept(I input) throws E;

}
