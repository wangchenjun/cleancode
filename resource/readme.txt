https://github.com/alibaba/p3c?spm=a2c4e.11153940.blogcont656256.16.36c8482bOUEb7V


	• 命名
		○ 避免误导
			§ 不要使用专有名词做为变量名，类名，etc.   
			§ 如果使用类似 userList这样的名字时，应该确保使用的类型确实就是List
			§ 我们依赖IDE的提示功能来写代码，往往会略过方法说明，而挑一个名字看起来像是我们要用的功能的方法，所以一个好的命名对人对己都好
			§ 避免使用 l o 这类难以分辨的变量名
		○ 做有意义的区别
			§ 避免废话
				□ Variable/Var不要出现在变量里
				□ Table不要出现在表名中 
				□ getAccounts()/getAccount()/getAccountInfo() 避免同时出现在一个系统中
				□ 避免在一个系统中同时出现 userInfo, userData, user
		○ 用英语单词，别用拼音
		○ 使用可搜索的名字
			§ 单字母名称仅用于短方法的本地变量，名字的长短应与其作用域大小相对应
		○ 类名是名词，方法名是动词
		○ 在一个系统中一个概念对应一个单词
			§ 比如，fetch，retrive，get
	• 函数
		○ 只做一件事
		函数应该只做一件事。做好这件事，只做这件事。
			§ 函数中的多个步骤是在同一个 抽象层次上，那么这个函数是在做一件事。
			§ 编写函数是为了把一个大一些的概念拆分成另一个抽象层次上的一些列步骤
		sample 中的例子就有多个抽象层次在一起的状况：
			1. getHtml()
			2. StringpagePathName=PathParser.render(pagePath);
			3. pageContent.append("!include-setup.").append(pagePathName).append("\n");
		○ 使用多态来替换switch