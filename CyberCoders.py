""" 
 * Selenium Webdriver - Simple Project
 * Specifically designed for Jobs at CyberCoders
 * Designed and Developed by: Samuel Benison Email-(samuel.jeyarajvictor@mavs.uta.edu)
"""

from selenium import webdriver
from selenium.webdriver.common.keys import Keys
import time

driver = webdriver.Firefox()
driver.maximize_window()
driver.get("http://www.cybercoders.com/")
time.sleep(5)
assert "CyberCoders" in driver.title
elem1 = driver.find_element_by_link_text("Jobs")
elem1.click()
time.sleep(5)
elem2 = driver.find_element_by_id("global-search-terms")
elem2.send_keys("QA Automation Engineer")
elem2 = driver.find_element_by_id("global-search-location")
elem2.send_keys("San Diego, CA")
elem2.send_keys(Keys.RETURN)
time.sleep(5)
assert "No results found." not in driver.page_source
elem3 = driver.find_element_by_link_text("QA Automation Test Engineer - Selenium")
elem3.click()
time.sleep(5)
elem4 = driver.find_element_by_link_text("Ben Stehle")
elem4.click()
time.sleep(5)
elem4 = driver.find_element_by_link_text("Show more fun facts")
elem4.click()
time.sleep(11)
driver.close()