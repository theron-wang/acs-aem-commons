package com.uber.lib.unannotated.collections;

public class Item<K, V> {
    public final K key;
    public final V value;

    public Item(K k, V v) {
        this.key = k;
        this.value = v;
    }
}
