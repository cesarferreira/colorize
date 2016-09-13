package github.cesarferreira.colorize;


public class Colorize {

    /**
     * Adds alpha to a hex color
     *
     * @param originalColor color, without alpha
     * @param alpha         from 0.0 to 1.0
     * @return the original color with alpha
     */
    public static String addAlpha(String originalColor, double alpha) {
        long alphaFixed = Math.round(alpha * 255);
        String alphaHex = Long.toHexString(alphaFixed);
        if (alphaHex.length() == 1) {
            alphaHex = "0" + alphaHex;
        }
        originalColor = originalColor.replace("#", "#" + alphaHex);


        return originalColor;
    }

    /**
     * Convert hex to int color
     *
     * @param hex hex color (e.g. "#AFC81C")
     * @return the int value of the color
     */
    public static int HexToColor(String hex) {
        return Integer.parseInt(hex.replaceFirst("^#", ""), 16);
    }
}
