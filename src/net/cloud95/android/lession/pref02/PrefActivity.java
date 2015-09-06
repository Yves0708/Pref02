package net.cloud95.android.lession.pref02;

import java.util.HashSet;
import java.util.Set;

import android.content.SharedPreferences;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.os.Bundle;
import android.preference.CheckBoxPreference;
import android.preference.EditTextPreference;
import android.preference.ListPreference;
import android.preference.MultiSelectListPreference;
import android.preference.PreferenceActivity;
import android.preference.PreferenceManager;
import android.preference.RingtonePreference;

// 繼承自PreferenceActivity的設定元件類別
// 實作設定值改變監聽介面
public class PrefActivity extends PreferenceActivity 
    implements OnSharedPreferenceChangeListener {
    
    // 設定畫面元件
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 指定使用的設定畫面配置資源
        // 建立讀取資料用的SharedPreferences物件
    }

    private void processViews() {
        // 取得設定畫面元件
    }
    
    @Override
    protected void onResume() {
        super.onResume();
        
        // 設定畫面元件的說明
        // 註冊實作設定值改變監聽事件
    }
    
    // 設定畫面元件的說明
    private void setSummary(String key) {
    }
    
    @Override
    protected void onPause() {
        // 移除實作設定值改變監聽事件
        super.onPause();
    }    

    // 設定值改變監聽介面實作方法
    // 第一個參數是使用中的SharedPreferences物件
    // 第二個參數是改變設定的資料名稱    
    @Override
    public void onSharedPreferenceChanged(
            SharedPreferences sharedPreferences, String key) {
    }

}
