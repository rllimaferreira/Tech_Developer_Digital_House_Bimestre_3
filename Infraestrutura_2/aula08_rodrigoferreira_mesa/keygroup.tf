resource "aws_security_group" "acesso-web" {
  name = "acesso-web"
  description = "acesso web"
  ingress {
    description      = "HTTP"
    from_port        = 80
    to_port          = 80
    protocol         = "tcp"
    cidr_blocks      = ["0.0.0.0/0"]
    ipv6_cidr_blocks = ["::/0"]
  }
  tags = {
    "Name" = "web"
  }
}
  resource "aws_key_pair" "chave-SSH" {
  key_name = "**********"
  public_key = file("**********.pub")
}