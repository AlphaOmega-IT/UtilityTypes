package me.blvckbytes.utilitytypes;

@FunctionalInterface
public interface FUnsafeBiConsumer<I1, I2, E extends Throwable> {

  void accept(I1 input1, I2 input2) throws E;

}
