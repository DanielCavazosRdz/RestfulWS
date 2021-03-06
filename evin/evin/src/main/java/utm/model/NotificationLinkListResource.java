package utm.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class NotificationLinkListResource {
	
	private List<Link> links = new ArrayList<>();
	private List<Notification> notifications = new ArrayList<>();
	
	@XmlElement(name = "link")
	public List<Link> getLinks() {
		return links;
	}
	
	public void setLinks(List<Link> links) {
		this.links = links;
	}
	
	public void addLink(Link link) {
		this.links.add(link);
	}
	
	@XmlElement(name = "notification")
	public List<Notification> getNotifications() {
		return notifications;
	}
	
	public void setNotifications(List<Notification> notifications) {
		this.notifications = notifications;
	}
	
	public void addnotification(Notification notification) {
		this.notifications.add(notification);
	}
	
}
