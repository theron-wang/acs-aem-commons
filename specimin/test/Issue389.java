package com.uber;

import javax.annotation.Nullable;
import com.uber.lib.unannotated.collections.Item;
import com.uber.lib.unannotated.collections.MapLike;

public class Issue389 {
    public static MapLike<String, String> test_389(@Nullable Item<String, String> item) {
        MapLike<String, String> map = new MapLike<>();
        if (item != null) { // Required to trigger dataflow analysis
            map.put(item);
        }
        return map;
    }
}
