<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>body_Automation BookstoreClear textAB Testi_7150f6</name>
   <tag></tag>
   <elementGuidId>648c11ee-81c5-4274-8374-14373bc54c60</elementGuidId>
   <selectorCollection>
      <entry>
         <key>CSS</key>
         <value>body.ui-mobile-viewport.ui-overlay-b</value>
      </entry>
      <entry>
         <key>XPATH</key>
         <value>//body</value>
      </entry>
   </selectorCollection>
   <selectorMethod>XPATH</selectorMethod>
   <smartLocatorCollection>
      <entry>
         <key>SMART_LOCATOR</key>
         <value>body</value>
      </entry>
   </smartLocatorCollection>
   <smartLocatorEnabled>false</smartLocatorEnabled>
   <useRalativeImagePath>true</useRalativeImagePath>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>body</value>
      <webElementGuid>d4162a4e-d73f-429e-b642-a830c7a91e8e</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>class</name>
      <type>Main</type>
      <value>ui-mobile-viewport ui-overlay-b</value>
      <webElementGuid>7474c1de-b6a2-47d5-9f1e-d41d03cd281c</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>
	

		
			Automation Bookstore
		

		

			
				Clear text
			
			
				
					//AB Testing - Randomly include price
					var includePrice;
					const queryString = window.location.search;
					const urlParams = new URLSearchParams(queryString);
					if(urlParams.get('abtest') == 1){

						if(Math.floor(Math.random() * 2) == 1){
							includePrice = true;
						}
						else includePrice = false;
					}
					else includePrice = true;
					

					var products = getProducts();
					$.each(products, function () {
						$.each(this, function (index, product) {
							var list = document.getElementById('productList');
							var listItem = document.createElement('li');
							listItem.setAttribute('id', &quot;pid&quot; + product.id);
							var bookInfo = `&lt;a href='#'>&lt;img id='pid${product.id}_thumb' src='${product.thumb}' class='ui-li-thumb'>&lt;h2 id='pid${product.id}_title'>${product.name}&lt;/h2>&lt;p id='pid${product.id}_author'>${product.author}&lt;/p>`;

							
							const priceInfo = `&lt;p class='ui-li-aside' id='pid${product.id}_price'>$${product.price}&lt;/p>`;
							if(includePrice) bookInfo += priceInfo;

							bookInfo += &quot;&lt;/a>&quot;

							listItem.innerHTML = bookInfo;
							list.appendChild(listItem); 
						 });
					});
				Test Automation in the Real WorldGreg Paskal$9.99Experiences of Test AutomationDorothy Graham and Mark Fewster$44.09Agile TestingLisa Crispin and Janet Gregory$49.07How Google Tests SoftwareJames A. Whittaker, Jason Arbon, Jeff Carollo$31.67Java For TestersAlan Richardson$29.99Advanced Selenium in JavaPaul Watson$29.99The Cucumber for Java BookSeb Rose$34.99BDD in ActionJohn Ferguson Smart$40.31
			

		

	


loadingid(&quot;searchBar&quot;)</value>
      <webElementGuid>5e2091ed-08ed-49f0-b6c8-439a732bb693</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>/html[@class=&quot;ui-mobile&quot;]/body[@class=&quot;ui-mobile-viewport ui-overlay-b&quot;]</value>
      <webElementGuid>d7429586-f4e8-4701-a54d-be126a2bfaab</webElementGuid>
   </webElementProperties>
   <webElementXpaths>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:position</name>
      <type>Main</type>
      <value>//body</value>
      <webElementGuid>d4bfa43f-f0d5-418e-ac94-9df0b2da136a</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:customAttributes</name>
      <type>Main</type>
      <value>//body[(text() = concat(&quot;
	

		
			Automation Bookstore
		

		

			
				Clear text
			
			
				
					//AB Testing - Randomly include price
					var includePrice;
					const queryString = window.location.search;
					const urlParams = new URLSearchParams(queryString);
					if(urlParams.get(&quot; , &quot;'&quot; , &quot;abtest&quot; , &quot;'&quot; , &quot;) == 1){

						if(Math.floor(Math.random() * 2) == 1){
							includePrice = true;
						}
						else includePrice = false;
					}
					else includePrice = true;
					

					var products = getProducts();
					$.each(products, function () {
						$.each(this, function (index, product) {
							var list = document.getElementById(&quot; , &quot;'&quot; , &quot;productList&quot; , &quot;'&quot; , &quot;);
							var listItem = document.createElement(&quot; , &quot;'&quot; , &quot;li&quot; , &quot;'&quot; , &quot;);
							listItem.setAttribute(&quot; , &quot;'&quot; , &quot;id&quot; , &quot;'&quot; , &quot;, &quot;pid&quot; + product.id);
							var bookInfo = `&lt;a href=&quot; , &quot;'&quot; , &quot;#&quot; , &quot;'&quot; , &quot;>&lt;img id=&quot; , &quot;'&quot; , &quot;pid${product.id}_thumb&quot; , &quot;'&quot; , &quot; src=&quot; , &quot;'&quot; , &quot;${product.thumb}&quot; , &quot;'&quot; , &quot; class=&quot; , &quot;'&quot; , &quot;ui-li-thumb&quot; , &quot;'&quot; , &quot;>&lt;h2 id=&quot; , &quot;'&quot; , &quot;pid${product.id}_title&quot; , &quot;'&quot; , &quot;>${product.name}&lt;/h2>&lt;p id=&quot; , &quot;'&quot; , &quot;pid${product.id}_author&quot; , &quot;'&quot; , &quot;>${product.author}&lt;/p>`;

							
							const priceInfo = `&lt;p class=&quot; , &quot;'&quot; , &quot;ui-li-aside&quot; , &quot;'&quot; , &quot; id=&quot; , &quot;'&quot; , &quot;pid${product.id}_price&quot; , &quot;'&quot; , &quot;>$${product.price}&lt;/p>`;
							if(includePrice) bookInfo += priceInfo;

							bookInfo += &quot;&lt;/a>&quot;

							listItem.innerHTML = bookInfo;
							list.appendChild(listItem); 
						 });
					});
				Test Automation in the Real WorldGreg Paskal$9.99Experiences of Test AutomationDorothy Graham and Mark Fewster$44.09Agile TestingLisa Crispin and Janet Gregory$49.07How Google Tests SoftwareJames A. Whittaker, Jason Arbon, Jeff Carollo$31.67Java For TestersAlan Richardson$29.99Advanced Selenium in JavaPaul Watson$29.99The Cucumber for Java BookSeb Rose$34.99BDD in ActionJohn Ferguson Smart$40.31
			

		

	


loadingid(&quot;searchBar&quot;)&quot;) or . = concat(&quot;
	

		
			Automation Bookstore
		

		

			
				Clear text
			
			
				
					//AB Testing - Randomly include price
					var includePrice;
					const queryString = window.location.search;
					const urlParams = new URLSearchParams(queryString);
					if(urlParams.get(&quot; , &quot;'&quot; , &quot;abtest&quot; , &quot;'&quot; , &quot;) == 1){

						if(Math.floor(Math.random() * 2) == 1){
							includePrice = true;
						}
						else includePrice = false;
					}
					else includePrice = true;
					

					var products = getProducts();
					$.each(products, function () {
						$.each(this, function (index, product) {
							var list = document.getElementById(&quot; , &quot;'&quot; , &quot;productList&quot; , &quot;'&quot; , &quot;);
							var listItem = document.createElement(&quot; , &quot;'&quot; , &quot;li&quot; , &quot;'&quot; , &quot;);
							listItem.setAttribute(&quot; , &quot;'&quot; , &quot;id&quot; , &quot;'&quot; , &quot;, &quot;pid&quot; + product.id);
							var bookInfo = `&lt;a href=&quot; , &quot;'&quot; , &quot;#&quot; , &quot;'&quot; , &quot;>&lt;img id=&quot; , &quot;'&quot; , &quot;pid${product.id}_thumb&quot; , &quot;'&quot; , &quot; src=&quot; , &quot;'&quot; , &quot;${product.thumb}&quot; , &quot;'&quot; , &quot; class=&quot; , &quot;'&quot; , &quot;ui-li-thumb&quot; , &quot;'&quot; , &quot;>&lt;h2 id=&quot; , &quot;'&quot; , &quot;pid${product.id}_title&quot; , &quot;'&quot; , &quot;>${product.name}&lt;/h2>&lt;p id=&quot; , &quot;'&quot; , &quot;pid${product.id}_author&quot; , &quot;'&quot; , &quot;>${product.author}&lt;/p>`;

							
							const priceInfo = `&lt;p class=&quot; , &quot;'&quot; , &quot;ui-li-aside&quot; , &quot;'&quot; , &quot; id=&quot; , &quot;'&quot; , &quot;pid${product.id}_price&quot; , &quot;'&quot; , &quot;>$${product.price}&lt;/p>`;
							if(includePrice) bookInfo += priceInfo;

							bookInfo += &quot;&lt;/a>&quot;

							listItem.innerHTML = bookInfo;
							list.appendChild(listItem); 
						 });
					});
				Test Automation in the Real WorldGreg Paskal$9.99Experiences of Test AutomationDorothy Graham and Mark Fewster$44.09Agile TestingLisa Crispin and Janet Gregory$49.07How Google Tests SoftwareJames A. Whittaker, Jason Arbon, Jeff Carollo$31.67Java For TestersAlan Richardson$29.99Advanced Selenium in JavaPaul Watson$29.99The Cucumber for Java BookSeb Rose$34.99BDD in ActionJohn Ferguson Smart$40.31
			

		

	


loadingid(&quot;searchBar&quot;)&quot;))]</value>
      <webElementGuid>c95e8d9b-0f68-4f48-a9b4-7221add8001c</webElementGuid>
   </webElementXpaths>
</WebElementEntity>
