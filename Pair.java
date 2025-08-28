import java.util.ArrayList;

/**
 * TODO: ทำให้คลาสนี้เป็น Generic <K, V> ที่สามารถเก็บอ็อบเจกต์ได้ 2 ชนิด
 */
public class Pair<K, V> {
    private K Key;
    private V Value;

    public Pair(K Key, V Value){
        this.Key = Key;
        this.Value = Value;
    }

    public K getKey(){
        return this.Key;
    }

    public V getValue(){
        return this.Value;
    }
}