package hashtable;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RepeatedWords {
    @Test
    public void RepeatWordsTest(){
        App app =new App();

        assertEquals("{a=2}",App.repeatedWordsFrequently("Once upon a time, there was a brave princess who..."));
    }
    @Test
    public void RepeatWordsTest2(){
        App app =new App();

        assertEquals("{the=2, was=2, i=2, summer=2}",App.repeatedWordsFrequently("It was a queer, sultry summer, the summer they electrocuted the Rosenbergs, and I didn’t know what I was doing in New York..."));
    }
    @Test
    public void RepeatWordsTest3(){
        App app =new App();

        assertEquals("{all=2, period=2, before=2, going=2, in=2, was=11, direct=2, for=2, its=2, epoch=2, had=2, it=10, we=4, the=14, times=2, were=2, of=12, season=2, age=2, us=2}",App.repeatedWordsFrequently("It was the best of times, it was the worst of times, it was the age of wisdom, it was the age of foolishness, it was the epoch of belief, it was the epoch of incredulity, it was the season of Light, it was the season of Darkness, it was the spring of hope, it was the winter of despair, we had everything before us, we had nothing before us, we were all going direct to Heaven, we were all going direct the other way – in short, the period was so far like the present period, that some of its noisiest authorities insisted on its being received, for good or for evil, in the superlative degree of comparison only..."));
    }
}
