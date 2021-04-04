package com.nanosoft.MP_Portal.Utils;

public class XpathUtils {

	public static class MP_Login {

		public static final String UserId = "/html/body/div/div[2]/div/form/div[1]/div/input";
		public static final String Password = "/html/body/div/div[2]/div/form/div[2]/div/input";
		public static final String Submit = "/html/body/div/div[2]/div/form/div[4]/div/button";
	}

	
	public static class Master_Setup{
		
		public static final String মাস্টার_সেটআপ = "/html/body/div[1]/aside/div/div[4]/div/div/nav/ul/li[2]/a/p";
		public static final String মন্ত্রণালয়_যুক্ত = "/html/body/div[1]/div[1]/section/div/div/div/div/div[1]/a";
		public static final String মন্ত্রণালয়ের_নাম_ইংলিশ = "/html/body/div[1]/div[1]/div[2]/div/div/form/div/div[1]/div[1]/div/input";
		public static final String মন্ত্রণালয়ের_নাম_বাংলা = "/html/body/div[1]/div[1]/div[2]/div/div/form/div/div[1]/div[2]/div/input";
		public static final String মন্ত্রণালয়_সংরক্ষণ="/html/body/div[1]/div[1]/div[2]/div/div/form/div/div[2]/div/div/button[1]";
		
		
		public static final String নির্বাচনী_এলাকা_যুক্ত="/html/body/div[1]/div[1]/section/div/div/div/div/div[1]/a";
		public static final String নির্বাচনী_এলাকার_নাম্বার="/html/body/div[1]/div[1]/div[2]/div/div/form/div/div[1]/div[1]/div/input";
		public static final String নির্বাচনী_এলাকার_নাম="/html/body/div[1]/div[1]/div[2]/div/div/form/div/div[1]/div[2]/div/input"; 
		public static final String নির্বাচনী_এলাকার_নাম_ইংরেজি="/html/body/div[1]/div[1]/div[2]/div/div/form/div/div[1]/div[3]/div/input";
		
		public static final String নির্বাচনী_এলাকার_বিভাগ="/html/body/div[1]/div[1]/div[2]/div/div/form/div/div[1]/div[4]/div/select";
		public static final String নির্বাচনী_এলাকার_জেলা="/html/body/div[1]/div[1]/div[2]/div/div/form/div/div[1]/div[5]/div/select";
		public static final String নির্বাচনী_এলাকার_উপজেলা="/html/body/div[1]/div[1]/div[2]/div/div/form/div/div[1]/div[6]/div/select";
		public static final String নির্বাচনী_এলাকার_সাবমিট="/html/body/div[1]/div[1]/div[2]/div/div/form/div/div[2]/div/div/button[3]";
		
		
		public static final String ডিপার্টমেন্ট_যুক্ত ="/html/body/div[1]/div[1]/section/div/div/div/div/div[1]/a";
		public static final String ডিপার্টমেন্ট_নাম_ইংরেজি="/html/body/div[1]/div[1]/div[2]/div/div/form/div/div[1]/div[1]/div/input";
		public static final String ডিপার্টমেন্ট_নাম_বাংলা="/html/body/div[1]/div[1]/div[2]/div/div/form/div/div[1]/div[2]/div/input";
		public static final String ডিপার্টমেন্ট_সাবমিট="/html/body/div[1]/div[1]/div[2]/div/div/form/div/div[2]/div/div/button[1]";
		
		
		public static final String পদবি_যুক্ত_করুন ="/html/body/div[1]/div[1]/section/div/div/div/div/div[1]/a";
		public static final String পদবি_নাম_ইংরেজি ="/html/body/div[1]/div[1]/div[2]/div/div/form/div/div[1]/div[1]/div/input";
		public static final String পদবি_নাম_বাংলা ="/html/body/div[1]/div[1]/div[2]/div/div/form/div/div[1]/div[2]/div/input";
		public static final String পদবি_সাবমিট ="/html/body/div[1]/div[1]/div[2]/div/div/form/div/div[2]/div/div/button[1]";
		
		
		public static final String সংসদ_যুক্ত_করুন="/html/body/div[1]/div[1]/section/div/div/div/div/div[1]/a";
		public static final String সংসদ_নং="/html/body/div[1]/div[1]/div[2]/div/div/form/div/div[1]/div[1]/div/input";
		public static final String সংসদের_তারিখ_হইতে="/html/body/div[1]/div[1]/div[2]/div/div/form/div/div[1]/div[2]/div/div/input";
		public static final String সংসদের_তারিখ_পর্যন্ত="/html/body/div[1]/div[1]/div[2]/div/div/form/div/div[1]/div[3]/div/div/input";
		public static final String সংসদ_সংরক্ষণ="/html/body/div[1]/div[1]/div[2]/div/div/form/div/div[2]/div/div/button[1]";
		
		
		public static final String সংসদ_অধিবেশন_যুক্ত="/html/body/div[1]/div[1]/section/div/div/div/div/div[1]/a";
		public static final String সংসদ_অধিবেশন_নং="/html/body/div[1]/div[1]/div[2]/div/div/form/div/div[1]/div[1]/div/select";
		public static final String অধিবেশন_নং="/html/body/div[1]/div[1]/div[2]/div/div/form/div/div[1]/div[2]/div/select";
		public static final String ঘোষণার_তারিখ="/html/body/div[1]/div[1]/div[2]/div/div/form/div/div[1]/div[3]/div/div/input";
		public static final String ঘোষণার_তারিখ_হইতে="/html/body/div[1]/div[1]/div[2]/div/div/form/div/div[1]/div[4]/div/div/input";
		public static final String ঘোষণার_তারিখ_পর্যন্ত="/html/body/div[1]/div[1]/div[2]/div/div/form/div/div[1]/div[5]/div/div/input";
		public static final String সংযুক্তি="attachment";
		public static final String সংসদ_অধিবেশন_সংরক্ষণ="/html/body/div[1]/div[1]/div[2]/div/div/form/div/div[3]/div/div/button[1]";
		
		
		public static final String রাজনৈতিক_দল_যুক্ত_করুন="/html/body/div[1]/div[1]/section/div/div/div/div/div[1]/a";
		public static final String রাজনৈতিক_দল_নাম_ইংরেজি ="/html/body/div[1]/div[1]/div[2]/div/div/form/div/div[1]/div[1]/div/input";
		public static final String রাজনৈতিক_দল_নাম_বাংলা ="/html/body/div[1]/div[1]/div[2]/div/div/form/div/div[1]/div[2]/div/input";
		public static final String রাজনৈতিক_দল_সংরক্ষণ ="/html/body/div[1]/div[1]/div[2]/div/div/form/div/div[2]/div/div/button[1]";
		
		
		public static final String বিভাগ_যুক্ত_করুন="/html/body/div[1]/div[1]/section/div/div/div/div/div[1]/a";
		public static final String বিভাগ_নাম_বাংলা="/html/body/div[1]/div[1]/div[2]/div/div/form/div/div[1]/div[1]/div/input";
		public static final String বিভাগ_নাম_ইংরেজি="/html/body/div[1]/div[1]/div[2]/div/div/form/div/div[1]/div[2]/div/input";
		public static final String বিভাগ_ওয়েবসাইট_লিংক="/html/body/div[1]/div[1]/div[2]/div/div/form/div/div[1]/div[3]/div/input";
		public static final String বিভাগ_সংরক্ষণ="/html/body/div[1]/div[1]/div[2]/div/div/form/div/div[2]/div/div/button[3]";
		
		
		public static final String জেলা_যুক্ত_করুন="/html/body/div[1]/div[1]/section/div/div/div/div/div[1]/a";
		public static final String জেলা_নাম_বাংলা="/html/body/div[1]/div[1]/div[2]/div/div/form/div/div[1]/div[1]/div/input";
		public static final String জেলা_নাম_ইংরেজি="/html/body/div[1]/div[1]/div[2]/div/div/form/div/div[1]/div[2]/div/input";
		public static final String জেলা_বিভাগ="/html/body/div[1]/div[1]/div[2]/div/div/form/div/div[1]/div[3]/div/select";
		public static final String জেলা_অক্ষাংশ="/html/body/div[1]/div[1]/div[2]/div/div/form/div/div[1]/div[4]/div/input";
		public static final String জেলা_দ্রাঘিমাংশ="/html/body/div[1]/div[1]/div[2]/div/div/form/div/div[1]/div[5]/div/input";
		public static final String জেলা_ওয়েবসাইট_লিংক="/html/body/div[1]/div[1]/div[2]/div/div/form/div/div[1]/div[6]/div/input";
		public static final String জেলা_সংরক্ষণ="/html/body/div[1]/div[1]/div[2]/div/div/form/div/div[2]/div/div/button[3]";
		
		
		public static final String উপজেলা_যুক্ত_করুন="/html/body/div[1]/div[1]/section/div/div/div/div/div[1]/a";
		public static final String উপজেলা_নাম_বাংলা="/html/body/div[1]/div[1]/div[2]/div/div/form/div/div[1]/div[1]/div/input";
		public static final String উপজেলা_নাম_ইংরেজি="/html/body/div[1]/div[1]/div[2]/div/div/form/div/div[1]/div[2]/div/input";
		public static final String উপজেলা_বিভাগ ="/html/body/div[1]/div[1]/div[2]/div/div/form/div/div[1]/div[3]/div/select";
		public static final String উপজেলা_জেলা="/html/body/div[1]/div[1]/div[2]/div/div/form/div/div[1]/div[4]/div/select";
		public static final String উপজেলা_ওয়েবসাইট_লিংক="/html/body/div[1]/div[1]/div[2]/div/div/form/div/div[1]/div[5]/div/input";
		public static final String উপজেলা_সংরক্ষণ="/html/body/div[1]/div[1]/div[2]/div/div/form/div/div[2]/div/div/button[3]";
	}
	
	public static class ProfileNactivities{
		
		public static final String প্রোফাইলএন্ডএক্টিভিটিস="/html/body/div[1]/aside/div/div[4]/div/div/nav/ul/li[4]/a/p";
		public static final String সংসদ_সদস্য_যুক্ত_করুন="/html/body/div[1]/div[1]/div[2]/div/div/div[1]/h4/a";
		public static final String ইমেইল="/html/body/div[1]/div[1]/div[2]/div/div/div[2]/form/div[1]/div[2]/input";
		public static final String পাসওয়ার্ড="/html/body/div[1]/div[1]/div[2]/div/div/div[2]/form/div[1]/div[3]/input"; 
		public static final String পাসওয়ার্ড_নিশ্চিত_করুন="/html/body/div[1]/div[1]/div[2]/div/div/div[2]/form/div[1]/div[4]/input";
		public static final String নাম_বাংলা="/html/body/div[1]/div[1]/div[2]/div/div/div[2]/form/div[1]/div[6]/input";
		public static final String নাম_ইংরেজি="/html/body/div[1]/div[1]/div[2]/div/div/div[2]/form/div[1]/div[7]/input";
		public static final String বাবার_নাম="/html/body/div[1]/div[1]/div[2]/div/div/div[2]/form/div[1]/div[8]/input";
		public static final String মায়ের_নাম="/html/body/div[1]/div[1]/div[2]/div/div/div[2]/form/div[1]/div[9]/input";
		public static final String বৈবাহিক_অবস্থা="/html/body/div[1]/div[1]/div[2]/div/div/div[2]/form/div[1]/div[10]/select";
		public static final String স্বামী_স্ত্রীর_নাম_বাংলা="/html/body/div[1]/div[1]/div[2]/div/div/div[2]/form/div[1]/div[11]/input";
		public static final String স্বামী_স্ত্রীর_নাম_ইংরেজি="/html/body/div[1]/div[1]/div[2]/div/div/div[2]/form/div[1]/div[12]/input";
		public static final String স্বামী_স্ত্রীর_জন্ম_তারিখ="/html/body/div[1]/div[1]/div[2]/div/div/div[2]/form/div[1]/div[13]/div/input";
		public static final String এন_আই_ডি="/html/body/div[1]/div[1]/div[2]/div/div/div[2]/form/div[1]/div[14]/input";
		public static final String স্বামী_স্ত্রীর_এন_আই_ডি_লিখুন="/html/body/div[1]/div[1]/div[2]/div/div/div[2]/form/div[1]/div[15]/input";
		public static final String ধর্ম="/html/body/div[1]/div[1]/div[2]/div/div/div[2]/form/div[1]/div[16]/select";
		public static final String পিএবিএক্স_নম্বর="/html/body/div[1]/div[1]/div[2]/div/div/div[2]/form/div[1]/div[17]/input";
		public static final String অফিসিয়াল_ফোন="/html/body/div[1]/div[1]/div[2]/div/div/div[2]/form/div[1]/div[18]/input";
		public static final String আবাসিক_ফোন="/html/body/div[1]/div[1]/div[2]/div/div/div[2]/form/div[1]/div[19]/input";
		public static final String অফিসের_ঠিকানা="/html/body/div[1]/div[1]/div[2]/div/div/div[2]/form/div[2]/div[1]/textarea";
		public static final String বর্তমান_ঠিকানা="/html/body/div[1]/div[1]/div[2]/div/div/div[2]/form/div[2]/div[2]/textarea";
		public static final String স্থায়ী_ঠিকানা="/html/body/div[1]/div[1]/div[2]/div/div/div[2]/form/div[2]/div[3]/textarea";
		public static final String সংসদ_পদবি="/html/body/div[1]/div[1]/div[2]/div/div/div[2]/form/div[2]/div[4]/select";
		public static final String সংসদ="/html/body/div[1]/div[1]/div[2]/div/div/div[2]/form/div[2]/div[5]/select";
		public static final String রাজনৈতিক_দল="/html/body/div[1]/div[1]/div[2]/div/div/div[2]/form/div[2]/div[6]/select";
		public static final String যে_জেলায়_জন্ম="/html/body/div[1]/div[1]/div[2]/div/div/div[2]/form/div[2]/div[7]/select";
		public static final String স্ট্যাটাস="/html/body/div[1]/div[1]/div[2]/div/div/div[2]/form/div[2]/div[8]/select";
		public static final String বিভাগ="/html/body/div[1]/div[1]/div[2]/div/div/div[2]/form/div[3]/div[1]/select";
		public static final String জেলা="/html/body/div[1]/div[1]/div[2]/div/div/div[2]/form/div[3]/div[2]/select";
		public static final String নির্বাচনী_এলাকা="/html/body/div[1]/div[1]/div[2]/div/div/div[2]/form/div[3]/div[3]/select";
		public static final String প্রোফাইল_সংরক্ষণ_করুন="/html/body/div[1]/div[1]/div[2]/div/div/div[2]/form/div[3]/div[4]/button";
		
		
		public static final String এমপিবুক_সংসদ_পদবি ="/html/body/div[1]/div[1]/section/div/div/div/div/div/form/div/div[1]/select";
		public static final String এমপিবুক_বিভাগ="/html/body/div[1]/div[1]/section/div/div/div/div/div/form/div/div[2]/select";
		public static final String এমপিবুক_জেলা="/html/body/div[1]/div[1]/section/div/div/div/div/div/form/div/div[3]/select";
		public static final String এমপিবুক_নির্বাচনী_এলাকা="/html/body/div[1]/div[1]/section/div/div/div/div/div/form/div/div[4]/select";
		public static final String এমপিবুক_নাম_দ্বারা_অনুসন্ধান="/html/body/div[1]/div[1]/section/div/div/div/div/div/form/div/div[5]/input";
		public static final String এমপিবুক_অনুসন্ধান="/html/body/div[1]/div[1]/section/div/div/div/div/div/form/div/div[6]/button";
		
		
		
	}
	
	public static class Notice {

		public static final String FindNotice = "/html/body/div[1]/aside/div/div[4]/div/div/nav/ul/li[5]";

		// BidhieAdd

		public static final String ClickOnBidhi = "/html/body/div[1]/div[1]/section/div/div/div/div/div[1]/a";
		public static final String BidhiNng = "/html/body/div[1]/div[1]/div[2]/div/div/form/div/div[1]/div[1]/div/input";
		public static final String BidhiNam = "/html/body/div[1]/div[1]/div[2]/div/div/form/div/div[1]/div[2]/div/input";
		public static final String Department = "/html/body/div[1]/div[1]/div[2]/div/div/form/div/div[1]/div[3]/div/span/span[1]/span/span[1]";
		public static final String DepartmentSelection = "/html/body/span/span/span[2]/ul/li[3]";
		public static final String Biboron = "/html/body/div[1]/div[1]/div[2]/div/div/form/div/div[1]/div[4]/div/div[3]/div[2]/p";
		public static final String Clear = "/html/body/div[1]/div[1]/div[2]/div/div/form/div/div[2]/div/div/button[2]";

		// SthayiCommittee
		
		public static final String SodosserNam="/html/body/div[1]/div[1]/div[2]/div/div/div[2]/form/div[1]/div[1]/div[1]/div/div[2]/select";
		public static final String TarikhHoiteClick="/html/body/div[1]/div[1]/div[2]/div/div/div[2]/form/div[1]/div[2]/div[1]/div/div[2]/div/input";
		public static final String TarikhPorjontwSelect="/html/body/div[1]/div[1]/div[2]/div/div/div[2]/form/div[1]/div[2]/div[2]/div/div[2]/div/input";
		

	}

}
