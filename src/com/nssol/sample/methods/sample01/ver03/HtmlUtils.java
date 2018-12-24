package com.nssol.sample.methods.sample01.ver03;

import com.nssol.sample.methods.sample01.*;

public class HtmlUtils {
    public static String testableHtml(PageData pageData, boolean isSuite) throws Exception {
        if (isTestPage(pageData)) {
            includeSetupAndTearDownPages(pageData, isSuite);
        }
        return pageData.getHtml();
    }

    private static void includeSetupAndTearDownPages(PageData pageData, boolean isSuite) {
        WikiPage testPage = pageData.getWikiPage();
        StringBuffer newPageContent = new StringBuffer();
        includeSetupPages(testPage, newPageContent, isSuite);
        newPageContent.append(pageData.getContent());
        includeTearDownPages(testPage, newPageContent, isSuite);
        pageData.setContent(newPageContent.toString());
    }

    private static boolean isTestPage(PageData pageData) {
        return pageData.hasAttribute("Test");
    }

    public static void includeSetupPages(WikiPage wikiPage, StringBuffer pageContent, boolean isSuite) {
        if (isSuite) {
            WikiPage suiteSetup = PageCrawlerImpl.getInheritedPage(SuiteResponder.SUITE_SETUP_NAME, wikiPage);
            if (suiteSetup != null) {
                WikiPagePath pagePath = suiteSetup.getPageCrawler().getFullPath(suiteSetup);
                String pagePathName = PathParser.render(pagePath);
                pageContent.append("!include -setup .").append(pagePathName).append("\n");
            }
        }
        WikiPage setup = PageCrawlerImpl.getInheritedPage("SetUp", wikiPage);
        if (setup != null) {
            WikiPagePath setupPath = wikiPage.getPageCrawler().getFullPath(setup);
            String setupPathName = PathParser.render(setupPath);
            pageContent.append("!include -setup .").append(setupPathName).append("\n");
        }

    }

    public static void includeTearDownPages(WikiPage wikiPage, StringBuffer pageContent, boolean isSuite) {
        WikiPage teardown = PageCrawlerImpl.getInheritedPage("TearDown", wikiPage);
        if (teardown != null) {
            WikiPagePath tearDownPath = wikiPage.getPageCrawler().getFullPath(teardown);
            String tearDownPathName = PathParser.render(tearDownPath);
            pageContent.append("!include -teardown .").append(tearDownPathName).append("\n");
        }
        if (isSuite) {
            WikiPage suiteTearDown = PageCrawlerImpl.getInheritedPage(SuiteResponder.SUITE_TEARDOWN_NAME, wikiPage);
            if (suiteTearDown != null) {
                WikiPagePath pagePath = suiteTearDown.getPageCrawler().getFullPath(suiteTearDown);
                String tearDownPathName = PathParser.render(pagePath);
                pageContent.append("!include -teardown .").append(tearDownPathName).append("\n");
            }
        }
    }
}
