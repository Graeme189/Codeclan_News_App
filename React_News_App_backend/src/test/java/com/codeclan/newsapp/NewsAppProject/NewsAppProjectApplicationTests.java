package com.codeclan.newsapp.NewsAppProject;

import com.codeclan.newsapp.NewsAppProject.models.Article;
import com.codeclan.newsapp.NewsAppProject.models.Category;
import com.codeclan.newsapp.NewsAppProject.models.Journalist;
import com.codeclan.newsapp.NewsAppProject.repository.ArticleRepository.ArticleRepository;
import com.codeclan.newsapp.NewsAppProject.repository.CategoryRepository.CategoryRepository;
import com.codeclan.newsapp.NewsAppProject.repository.JournalistRepository.JournalistRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class NewsAppProjectApplicationTests {

	@Autowired
	ArticleRepository articleRepository;

	@Autowired
	JournalistRepository journalistRepository;

	@Autowired
	CategoryRepository categoryRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void createArticleAndJournalist() {

		Journalist journalist1 = new Journalist("Iain", "McWhirter");
		journalistRepository.save(journalist1);

		Journalist journalist2 = new Journalist("Sally", "Magnusson");
		journalistRepository.save(journalist2);

		Article article1 = new Article(
				"Post-Crash Bitcoin Warning As Wallets Targeted In ‘Active And Ongoing’ Hack Attack",
				3,
				"A bad week for bitcoin investors just got worse. First, there was the crash, and now a threat to wallets has been identified.",
				"First bitcoin crashes and then more bad news is piled onto cryptocurrency investors Bitcoin wentinto" +
						" meltdown starting September 24 when the BTC price dropped by more than 10% " +
						" in what some highly-respected commentators referred to as a bitcoin crash. " +
						"The bad news for bitcoin continued through the week, with the price continuing " +
						"to fluctuate around, and below, $8,000 (£6,500). Now bitcoin buyers have been " +
						"issued a warning concerning another threat to their cryptocurrency investment; " +
						"an active and ongoing threat campaign that steals bitcoin wallets.",
				journalist1,
				"https://thumbor.forbes.com/thumbor/600x315/https%3A%2F%2Fspecials-images.forbesimg.com%2Fimageserve%2F976598338%2F960x0.jpg");
		articleRepository.save(article1);

		Article article2 = new Article(
				"Crypto Exchange Coindirect Launches OTC Brokerage in South Africa",
				4,
				"Cryptocurrency exchange Coindirect launches an over-the-counter brokerage service in South Africa",
				"Cryptocurrency exchange Coindirect launches an over-the-counter (OTC) brokerage in South Africa " +
						"Coindirect cryptocurrency exchange has launched an over-the-counter (OTC) brokerage system that targets " +
						"large volume traders. The service was launched for South Africa, " +
						"with the exchange promising its traders the lowest fees and the best prices." +
						"The decision to launch the OTC desk was informed by extensive research conducted" +
						" by the firm, the exchange’s COO Nic Haralambous stated in a press release: " +
						" During our first two years in the industry we have paid close attention " +
						"to which users are driving the volume of crypto trading." +
						" Our approach is to bring cryptocurrency to as many users as possible," +
						" however, " + "the data shows that a majority of the daily trading volume in South Africa right now comes " +
						"from a very small percentage of traders." + " This group of traders spends a lot of time " +
						"conducting research so that they can make their trades at the lowest fees and best prices, he went on. " +
						" The new service will solve both of these challenges for the traders. " +
						" Coindirect will use global integrations to create a wide pool of liquidity sources that will enable a best price guarantee. ",
				journalist2,
				"https://images.cointelegraph.com/images/740_aHR0cHM6Ly9zMy5jb2ludGVsZWdyYXBoLmNvbS9zdG9yYWdlL3VwbG9hZHMvdmlldy9iNTI5MGI0NTE4ZjY0ZTc5MTI1YWRkNzYzMTYxOWIwNS5qcGc=.jpg"
		);
		articleRepository.save(article2);

		Category category1 = new Category("Politics");
		categoryRepository.save(category1);
	}

	@Test
	public void canAddCategoryToArticle() {
		Journalist journalist1 = new Journalist("Iain", "McWhirter");
		journalistRepository.save(journalist1);

		Journalist journalist2 = new Journalist("Sally", "Magnusson");
		journalistRepository.save(journalist2);

		Article article1 = new Article(
				"Post-Crash Bitcoin Warning As Wallets Targeted In ‘Active And Ongoing’ Hack Attack",
				3,
				"A bad week for bitcoin investors just got worse. First, there was the crash, and now a threat to wallets has been identified.",
				"First bitcoin crashes and then more bad news is piled onto cryptocurrency investors Bitcoin wentinto" +
						" meltdown starting September 24 when the BTC price dropped by more than 10% " +
						" in what some highly-respected commentators referred to as a bitcoin crash. " +
						"The bad news for bitcoin continued through the week, with the price continuing " +
						"to fluctuate around, and below, $8,000 (£6,500). Now bitcoin buyers have been " +
						"issued a warning concerning another threat to their cryptocurrency investment; " +
						"an active and ongoing threat campaign that steals bitcoin wallets.",
				journalist1,
				"https://thumbor.forbes.com/thumbor/600x315/https%3A%2F%2Fspecials-images.forbesimg.com%2Fimageserve%2F976598338%2F960x0.jpg");
		articleRepository.save(article1);

		Article article2 = new Article(
				"Crypto Exchange Coindirect Launches OTC Brokerage in South Africa",
				4,
				"Cryptocurrency exchange Coindirect launches an over-the-counter brokerage service in South Africa",
				"Cryptocurrency exchange Coindirect launches an over-the-counter (OTC) brokerage in South Africa " +
						"Coindirect cryptocurrency exchange has launched an over-the-counter (OTC) brokerage system that targets " +
						"large volume traders. The service was launched for South Africa, " +
						"with the exchange promising its traders the lowest fees and the best prices." +
						"The decision to launch the OTC desk was informed by extensive research conducted" +
						" by the firm, the exchange’s COO Nic Haralambous stated in a press release: " +
						" During our first two years in the industry we have paid close attention " +
						"to which users are driving the volume of crypto trading." +
						" Our approach is to bring cryptocurrency to as many users as possible," +
						" however, " + "the data shows that a majority of the daily trading volume in South Africa right now comes " +
						"from a very small percentage of traders." + " This group of traders spends a lot of time " +
						"conducting research so that they can make their trades at the lowest fees and best prices, he went on. " +
						" The new service will solve both of these challenges for the traders. " +
						" Coindirect will use global integrations to create a wide pool of liquidity sources that will enable a best price guarantee. ",
				journalist2,
				"https://images.cointelegraph.com/images/740_aHR0cHM6Ly9zMy5jb2ludGVsZWdyYXBoLmNvbS9zdG9yYWdlL3VwbG9hZHMvdmlldy9iNTI5MGI0NTE4ZjY0ZTc5MTI1YWRkNzYzMTYxOWIwNS5qcGc=.jpg"
		);
		articleRepository.save(article2);

		Category category1 = new Category("Politics");
		categoryRepository.save(category1);

		article1.addCategory(category1);
		articleRepository.save(article1);
	}
}
