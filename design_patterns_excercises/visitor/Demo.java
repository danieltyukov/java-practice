package design_patterns_excercises.visitor;

public class Demo {

  public static void show() {
    var wavFile = WavFile.read("myfile.wav");
    wavFile.applyFilter(new NoiseReductionFilter());
    wavFile.applyFilter(new ReverbFilter());
    wavFile.applyFilter(new NormalizeFilter());
  }
}
