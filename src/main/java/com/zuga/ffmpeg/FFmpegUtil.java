package com.zuga.ffmpeg;

public class FFmpegUtil {

    static {
        System.loadLibrary("FFmpegLib");
    }

    public static int ffmpegCMDRun(String cmd) {
        String regulation = "[ \\t]+";
        final String[] split = cmd.split(regulation);
        return ffmpegRun(split);
    }

    public static native void initFFmpeg(boolean debug, String logUrl);

    private static native int ffmpegRun(String[] cmd);

    public static native int getThumb(String inputFile, String outputFile, String time);

    public static native void clipVideo(double startTime, double endTime, String inFile, String outFile);

    public static native void compress(String inFile, String outFile);

//    public static native void metaa(String file);
}
