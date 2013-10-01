require_relative "spec_helper"

describe FizzBuzz do
  
  describe "#value_of" do
    it "should return 1 for 1" do
      FizzBuzz.new.value_of(1).should == "1"
    end
  end
end
