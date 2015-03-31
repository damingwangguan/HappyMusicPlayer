package com.happyplayer.common;

import java.io.File;

import com.happyplayer.ui.R;

import android.graphics.Color;
import android.os.Environment;

/**
 * 记录一些基本的信息 如：第一次使用、颜色、是否开启桌面歌词等等。
 * 
 * @author Administrator
 * 
 */
public class Constants {
	/***
	 * ------------------------------------应用基本配置-----------------------------
	 **/
	/**
	 * 数据库名
	 */
	public static final String DB_NAME = "happy_player.db";

	/**
	 * 临时目录
	 */
	public final static String PATH_TEMP = Environment
			.getExternalStorageDirectory() + File.separator + "haplayer";

	/**
	 * 歌曲目录
	 */
	public final static String PATH_MP3 = PATH_TEMP + File.separator + "mp3";

	/**
	 * 歌词目录
	 */
	public final static String PATH_KSC = PATH_TEMP + File.separator + "ksc";
	/**
	 * 歌手写真目录
	 */
	public final static String PATH_ARTIST = PATH_TEMP + File.separator
			+ "artist";
	/**
	 * 专辑图
	 */
	public final static String PATH_ALBUM = PATH_TEMP + File.separator
			+ "album";

	/***
	 * ------------------------------------应用配置-----------------------------
	 **/
	/**
	 * 配置文件的名称
	 */
	public static String SHARE_PREFERENCE_NAME = "happy.player.sharepreference.name";
	/**
	 * 是否是第一次使用，默认值是true
	 */
	public static String THE_FIRST_KEY = "THE_FIRST_KEY";
	public static boolean THE_FIRST = true;

	/**
	 * 判断底部播放器的歌词是否显示
	 */
	public static String BAR_LRC_IS_OPEN_KEY = "BAR_LRC_IS_OPEN_KEY";
	public static boolean BAR_LRC_IS_OPEN = false;

	/**
	 * 主题颜色
	 */
	public static int BLACK_GROUND[] = { Color.rgb(26, 89, 154),
			Color.rgb(234, 84, 84), Color.rgb(240, 90, 154),
			Color.rgb(192, 80, 26), Color.rgb(148, 83, 237),
			Color.rgb(75, 104, 228), Color.rgb(44, 162, 249),
			Color.rgb(4, 188, 205), Color.rgb(242, 116, 77),
			Color.rgb(249, 169, 42), Color.rgb(105, 200, 78),
			Color.rgb(30, 186, 118), Color.rgb(31, 190, 158),
			Color.rgb(161, 161, 161), Color.rgb(214, 117, 213),
			Color.rgb(242, 106, 138), Color.rgb(211, 173, 114),
			Color.rgb(191, 199, 112), Color.rgb(120, 213, 214),
			Color.rgb(52, 145, 120) };
	/**
	 * 主题颜色面板索引
	 */
	public static String DEF_COLOR_INDEX_KEY = "COLOR_INDEX_KEY";
	public static int DEF_COLOR_INDEX = 0;
	/**
	 * 图片皮肤id
	 */
	public static int PICIDS[] = { R.drawable.skin_def, R.drawable.skin_def1,
			R.drawable.skin_def2, R.drawable.skin_def3, R.drawable.skin_def4,
			R.drawable.skin_def5, R.drawable.skin_def6, R.drawable.skin_def7,
			R.drawable.skin_def8, R.drawable.skin_def9, R.drawable.skin_def10,
			R.drawable.skin_def11 };
	/**
	 * 图片皮肤索引
	 */
	public static String DEF_PIC_INDEX_KEY = "DEF_PIC_INDEX_KEY";
	public static int DEF_PIC_INDEX = 0;

	/**
	 * 记录上一次播放的歌曲sid
	 */
	public static String PLAY_SID_KEY = "PLAY_SID_KEY";
	public static String PLAY_SID = "";
	/**
	 * 播放模式
	 */
	public static String PLAY_MODE_KEY = "PLAY_MODE_KEY";
	public static int PLAY_MODE = 1;

	/**
	 * 主页面标题文本被点击后的颜色
	 */
	public static int TEXT_COLOR_PRESSED = Color.rgb(255, 255, 255);
	/**
	 * 主页面标题文本默认颜色
	 */
	public static int TEXT_COLOR = Color.rgb(0, 0, 0);

	/**
	 * 显示桌面歌词
	 */
	public static String SHOWDESLRC_KEY = "SHOWDESLRC_KEY";
	public static boolean SHOWDESLRC = false;
	/**
	 * 图标x坐标
	 */
	public static String ICON_VIEWX_KEY = "ICON_VIEWX_KEY";
	public static int ICON_VIEWX = 0;

	/**
	 * 图标y坐标
	 */
	public static String ICON_VIEWY_KEY = "ICON_VIEWY_KEY";
	public static int ICON_VIEWY = 0;

	/**
	 * 显示EASYTOUCH
	 */
	public static String SHOWEASYTOUCH_KEY = "SHOWEASYTOUCH_KEY";
	public static boolean SHOWEASYTOUCH = false;
}
