package testJSON;

import com.google.gson.Gson;

public class Main {
	public static void main(String[] args) {
		Gson gson = new Gson();
		Obj obj = new Obj();
		obj.setName("gabriel");
		obj.setAge(23);
		System.out.println(gson.toJson(obj));
		System.out.println(gson.fromJson(gson.toJson(obj), Obj.class));
	}
}
