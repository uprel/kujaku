package io.ona.kujaku.comparisons;


public class EqualToComparison extends Comparison {
    private static final String TAG = "EqualToComparison";

    @Override
    public boolean compare(String a, String type, String b) {
        switch (type) {
            case TYPE_STRING:
                return a != null && a.compareTo(b) == 0;

            default:
                break;
        }

        return false;
    }

    @Override
    public String getFunctionName() {
        return "equalTo";
    }
}