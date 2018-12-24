package com.nssol.sample.methods.sample01;

public class PageData {

    private String content;

    public WikiPage getWikiPage() {
        return new WikiPage();
    }

    public boolean hasAttribute(String attr) {
        return true;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getHtml() {
        return "<html><p>" + this.content + "</p></html>";
    }
}
