package String;

public class ascii {
	public static void main(String args[]) {
		char a='A';
		int ascii=a;
		System.out.println(ascii);
	}

}<!DOCTYPE html>
<html>
<head>
    <title>Sample Layout</title>
    <style>
        body {
            font-family: Arial, sans-serif;
        }
        .container {
            display: grid;
            grid-template-areas:
                "nav header header header"
                "nav content content content"
                "footer footer footer footer";
            grid-template-columns: 1fr 3fr;
            grid-template-rows: auto 1fr auto;
            gap: 10px;
            height: 100vh;
        }
        .nav {
            grid-area: nav;
            background-color: #ccc;
            padding: 10px;
            writing-mode: vertical-lr;
            transform: rotate(180deg);

